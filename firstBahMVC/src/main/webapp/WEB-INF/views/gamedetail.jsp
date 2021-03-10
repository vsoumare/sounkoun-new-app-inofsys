<%@ include file="./common/header.jspf"%>
<%@ include file="./common/navigation.jspf"%>

		
		<div class="container">
				<h1>Game: ${game.name}</h1>
				<h2>Genre:  ${game.genre}</h2>
				<h2>Price: ${game.price}</h2>
				<p>
					Description: ${game.description}
				</p>
				
				<a class="btn btn-info" href="/game">Back to List</a>
				
		</div>
<%@ include file="./common/footer.jspf"%>
