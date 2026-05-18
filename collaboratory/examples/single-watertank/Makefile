
.PHONY: all
all: help		    ## Generate data and start model (default)

.PHONY: compile-erlang
compile-erlang: Watertank.abs index.html ## Compile the model (Erlang backend)
	absc --erlang Watertank.abs --modelapi-index-file index.html

.PHONY: run-erlang
run-erlang: compile-erlang	## Execute the model (Erlang backend)
	@echo "Open a browser at http://localhost:8080/ to see simulation results."
	gen/erl/run -p 8080 -l 100 -v

.PHONY: compile-java
compile-java: Watertank.abs index.html ## Compile the model (Java backend)
	absc --java Watertank.abs --modelapi-index-file index.html -o Watertank.jar

.PHONY: run-java
run-java: compile-java		## Execute the model (Java backend)
	@echo "Open a browser at http://localhost:8080/ to see simulation results."
	java -jar Watertank.jar -p 8080 -l 100

.PHONY: clean			## Remove generated files
clean:
	rm -rf gen/

.PHONY: help
help:				## Display this message
	@grep -E '^[a-zA-Z_-]+:.*?## .*$$' $(MAKEFILE_LIST) | sort | awk 'BEGIN {FS = ":.*?## "}; {printf "\033[36m%-30s\033[0m %s\n", $$1, $$2}'
