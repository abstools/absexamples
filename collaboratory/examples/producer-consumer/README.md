An example showing work queue `work_items` shared between two
processes `producer` and `consumer` running in the same object.  The
queue is length-limited, such that the producer temporarily stops when
there are more than 5 unprocessed items.
