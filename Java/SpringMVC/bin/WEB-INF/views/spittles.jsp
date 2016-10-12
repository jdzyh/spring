<c:forEach items="${spittleList}" var="spittle">
	<li id="spittle_<c:out value="spittle.id"/>">
		<div class="spittleMessage">
			<c:out value="${spittle.message}"/>
		</div>
		
		<span class="spittleTime"><c:out value="$spittle.time">
	</li>
</c:forEach>>