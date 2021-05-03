<!DOCTYPE HTML>
<html>
<head>
<title>SSE</title>
</head>
<body>

	<div id="icon">
		<h1>
			<span id="notification">Notifications</span>
		</h1>
	</div>

	<div id="sse">
		<button onclick="start()">Start</button>
	</div>
	
	<script>
    var number_of_notifications = 0;

    function start() {
 
        var eventSource = new EventSource("HelloServlet");  // servlet
        
        eventSource.onopen = function(){
        	number_of_notifications++;
         	console.log("Connection established! "+number_of_notifications); 
        };
         
        eventSource.onmessage = function(event) {
			console.log(event.data)
        };
    }
    </script>
</body>
</html>