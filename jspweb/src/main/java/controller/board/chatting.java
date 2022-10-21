package controller.board;

import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;

//@WebServlet("/chatting")		// 서블릿 URL 만들기
@ServerEndpoint("/chatting/{mid}")	// 웹서버에 웹소켓 URL 만들기 	URL/{변수명}
public class chatting {
		// 0. 접속명단 [ 세션=클라이언소켓 , 아이디 ] = map 
		public static Hashtable< Session , String > clients = new Hashtable<>();
		//////////////////// 접속 알람 메시지 ///////////////////////////
		// 1. 전송 메시지 구성
		public JSONObject jsonAlarm( String content ) throws IOException {
		JSONObject object = new JSONObject();
		object.put("type", "alarm");
		object.put("content", content);
		return object;
		}
		// * 알람 전송 함수
		public void sendmsg( JSONObject object ) throws IOException { // 2. 현재 접속한 모든 세션
		for(Session s : clients.keySet() ) {
			s.getBasicRemote().sendText(object.toString() );
			}
		}
		// 1. 접속
		@OnOpen	// 웹소켓이 들어왔을때 
		public void OnOpen( Session session , @PathParam("mid") String mid  ) throws IOException {
			sendmsg( jsonAlarm(mid+" 님이 들어왔습니다.") );
			clients.put(session, mid); // 서버소켓에서 해당 세션 저장하기
		}
		// 2. 나가기 
		@OnClose // 웹소켓을 나갔을때 
		public void onClose( Session session ) throws IOException {
			JSONObject object = jsonAlarm( clients.get(session)+" 님이 나갔습니다.");
			clients.remove(session); // 서버소켓에서 해당 세션 지우기
			sendmsg(object);
		}
		// 3. 메시지 받기
		@OnMessage // 웹소켓에 메시지 왔을때 
		public void onMessage( Session session , String msg ) throws IOException {
			for( Session s : clients.keySet() ) {
				s.getBasicRemote().sendText(msg);
			}
		}
}
