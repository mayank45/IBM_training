<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SSE Demo</title>
</head>
<body>

	<button onclick="consumeSse()">Run</button>

	<script>
		function consumeSse() {
			var eventSource = new EventSource("sse");

			console.log(eventSource);
			
			eventSource.onopen = function(){
				console.log("connection established")
			}
			eventSource.onerror = function(err){
				console.log(err);
				console.log("some error occurred")
			}
			
			eventSource.onmessage = function(event) {
				// console.log("From server: " + event);
				console.log("event received")
			}
		}
	</script>
</body>
</html>