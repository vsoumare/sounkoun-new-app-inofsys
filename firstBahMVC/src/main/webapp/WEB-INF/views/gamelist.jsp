
<%@ include file="./common/header.jspf"%>
<%@ include file="./common/navigation.jspf"%>
		 <div class="container">
		 
		 
		 <div class="container">
		 		<table class="table table-striped">
		 			<thead>
		 					<tr>
		 							<th>Name</th>
		 							<th>genre</th>
		 							<th>Details</th>
		 							<th>Delete</th>
		 					</tr>
		 			</thead>
		 			<tbody>
		 			<c:forEach items="${game}" var="ga">
		 					<tr>
		 							<th>${ga.name}</th>
		 							<th>${ga.genre}</th>
		 							<th><a class="btn btn-info" href="/detail?id=${ga.id}">More...</a></th>
		 							<th><a class="btn btn-danger"href="/deletegame?id=${ga.id}">Delete</a></th>
		 							
		 					</tr>
		 			</c:forEach>
		 					
		 			</tbody>
		 		</table>
		 </div>
		
		
		<a class="btn btn-success" href="/create">Add a New game</a>
	
<%@ include file="./common/footer.jspf"%>
