
.PHONY: all
all: run			## Generate data and start model (default)

.PHONY: compile
compile: CalendarTime.abs index.html ## Compile the model
	absc --erlang CalendarTime.abs --modelapi-index-file index.html

.PHONY: compile
run: compile			## Execute the model
	gen/erl/run -p 8080 -v

.PHONY: help
help:				## Display this message
	@grep -E '^[a-zA-Z_-]+:.*?## .*$$' $(MAKEFILE_LIST) | sort | awk 'BEGIN {FS = ":.*?## "}; {printf "\033[36m%-30s\033[0m %s\n", $$1, $$2}'
