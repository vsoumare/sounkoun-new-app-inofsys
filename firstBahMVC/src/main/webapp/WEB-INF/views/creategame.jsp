<%@ include file="./common/header.jspf"%>
<%@ include file="./common/navigation.jspf"%>

 <div class="container">
	<h1>Create a Game</h1>
	
	
	 	<form:form commandName="game" method="post">
	 	
	 	<fieldset class="form-group">
	 			<form:label path="name">Name</form:label> 
				<form:input path="name" type="text" class="form-control"  required="required" />
	 	</fieldset>
			
		<fieldset class="form-group">
				<form:label path="genre">Genre</form:label> 
				<form:input path="genre" type="text" class="form-control"  required="required" />
		</fieldset>	
			
		<fieldset class="form-group">
				<form:label path="description">Description</form:label> 
		      	 <form:input path="description" type="text" class="form-control"  required="required" />
		      	 <form:errors path="description" cssClass="text-danger" />
			 
		</fieldset>	
		
		<fieldset class="form-group">
				<form:label path="price">Price</form:label> 
				<form:input path="price" type="text" class="form-control"  required="required" />
		</fieldset>
			
			
			
			
			<input class="btn btn-info" type="submit" value="Create Game">
		</form:form> 
	</div>

<%@ include file="./common/footer.jspf"%>
