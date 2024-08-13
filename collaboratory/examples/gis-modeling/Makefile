
.PHONY: all
all: help

.PHONY: compile-java
compile-java: MapObjects.abs index.html ## Compile the model (Java backend)
	absc --java MapObjects.abs --modelapi-index-file index.html --modelapi-static-dir static -o MapObjects.jar

.PHONY: compile-erlang
compile-erlang: MapObjects.abs index.html ## Compile the model (Erlang backend)
	absc --erlang MapObjects.abs --modelapi-index-file index.html --modelapi-static-dir static



.PHONY: run-java
run-java: compile-java		## Execute the model (Java backend)
	java -jar MapObjects.jar -p 8080

.PHONY: run-erlang
run-erlang: compile-erlang	## Execute the model (Erlang backend)
	gen/erl/run -p 8080


.PHONY: help
help:				## Display this message
	@grep -E '^[a-zA-Z_-]+:.*?## .*$$' $(MAKEFILE_LIST) | sort | awk 'BEGIN {FS = ":.*?## "}; {printf "\033[36m%-30s\033[0m %s\n", $$1, $$2}'
