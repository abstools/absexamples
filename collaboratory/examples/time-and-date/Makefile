
.PHONY: all
all: run			## Generate data and start model (default)

.PHONY: compile
compile: CalendarTime.abs index.html ## Compile the model
	absc --java CalendarTime.abs --modelapi-index-file index.html -o CalendarTime.jar

.PHONY: compile
run: compile			## Execute the model
	java -jar CalendarTime.jar -p 8080

.PHONY: help
help:				## Display this message
	@grep -E '^[a-zA-Z_-]+:.*?## .*$$' $(MAKEFILE_LIST) | sort | awk 'BEGIN {FS = ":.*?## "}; {printf "\033[36m%-30s\033[0m %s\n", $$1, $$2}'
