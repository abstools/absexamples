
.PHONY: all
all: run			## Generate data and start model (default)

.PHONY: compile
compile: Watertank.abs index.html ## Compile the model
	absc --erlang Watertank.abs --modelapi-index-file index.html

.PHONY: run
run: compile			## Execute the model
	@echo "Open a browser at http://localhost:8080/ to see simulation results."
	gen/erl/run -p 8080 -l 100 -v

.PHONY: clean			## Remove generated files
clean:
	rm -rf gen/

.PHONY: help
help:				## Display this message
	@grep -E '^[a-zA-Z_-]+:.*?## .*$$' $(MAKEFILE_LIST) | sort | awk 'BEGIN {FS = ":.*?## "}; {printf "\033[36m%-30s\033[0m %s\n", $$1, $$2}'
