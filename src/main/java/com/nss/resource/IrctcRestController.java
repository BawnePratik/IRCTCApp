package com.nss.resource;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.nss.request.PassengerRequest;
import com.nss.response.TicketResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api("This is IRCTC Rest Controller which is used to book a train ticket")
public class IrctcRestController {

	
	@PostMapping(
			      value = "/bookTicket",
			      consumes = {
			    		      "application/xml",
			    		      "application/json"
			      },
			      produces = {
			    		  "application/xml",
		    		      "application/json"
			      }
			)
	@ApiOperation("This method is used to book a train ticket")
	public ResponseEntity<TicketResponse> bookTicket(@RequestBody PassengerRequest request){
		
		// logic to book ticket
		System.out.println(request);
		
		TicketResponse response = new TicketResponse();
		
		response.setStatus("CNF");
		response.setPrice(1500.09);
		
		BeanUtils.copyProperties(request, response);
		
		return new ResponseEntity<TicketResponse>(response, HttpStatus.CREATED);
	}
}
