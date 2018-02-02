package net.pkusoft.websocket;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

import com.pkusoft.framework.util.JsonUtils;

public class LocationDecoder implements Decoder.Text<Location> {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init( EndpointConfig arg0 ) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Location decode( String location ) throws DecodeException {
		return JsonUtils.jsonToBean( location, Location.class );
	}

	@Override
	public boolean willDecode( String arg0 ) {
		// TODO Auto-generated method stub
		return true;
	}

}
