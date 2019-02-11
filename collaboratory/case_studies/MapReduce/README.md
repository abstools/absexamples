# The MapReduce example

This ABS model implements variations on MapReduce, following the
explanations in the [original paper](https://research.google.com/archive/mapreduce-osdi04.pdf).

We show variations along three axes:
- Algorithm (word count, word occurrence, reverse index)

  Note that, since there are no delta parameters of String type, the
  word to be searched is hardcoded as `"it"`.  (This is called
  “without loss of generality” in academic-speak.)
  
- Deployment scenario (no deployment, unbounded number of machines,
  limited number of machines; machine capacity parameterized)

- Running cost (no cost vs. parameterized cost per algorithm step)

The following products are defined (compile with `absc -erlang -product=<name>`, e.g., `absc -erlang -product=WordsearchModel`):

    product WordcountModel (Wordcount, NoCost, NoDeploymentScenario);
    product WordcountFull (Wordcount, Cost{cost=10}, UnlimitedMachines{capacity=20});
    product WordcountDemo (Wordcount, Cost{cost=10}, LimitedMachines{capacity=20, machinelimit=2});
    product WordsearchModel (Wordsearch, NoCost, NoDeploymentScenario);
    product WordsearchFull (Wordsearch, Cost{cost=10}, UnlimitedMachines{capacity=20});
    product WordsearchDemo (Wordsearch, Cost{cost=10}, LimitedMachines{capacity=20, machinelimit=2});
    product IndexingModel (Indexing, NoCost, NoDeploymentScenario);
    product IndexingFull (Indexing, Cost{cost=10}, UnlimitedMachines{capacity=20});
    product IndexingDemo (Indexing, Cost{cost=10}, LimitedMachines{capacity=20, machinelimit=2});

# To do

- This model was written before the Model API existed; it would be
  nice to have a visualization of number of machines, their loads, and
  total run time.
