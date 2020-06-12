# Troubleshooting

### Aggregation on a globally windowed
If your pipeline attempts to perform an aggregation like GroupByKey on a globally windowed, non-triggered, unbounded PCollection, you'll see an error message similar to the following:

```
GroupByKey cannot be applied to non-bounded PCollection in the GlobalWindow without a trigger. 
Use a Window.into or Window.triggering transform prior to GroupByKey.
```

### WriteFiles to an unbounded PCollection

```
Must use windowed writes when applying WriteFiles to an unbounded PCollection
```

### Configures the number of output shards
Ref: [Class TextIO.Write](https://beam.apache.org/releases/javadoc/2.0.0/org/apache/beam/sdk/io/TextIO.Write.html#withNumShards-int-)
```
When applying WriteFiles to an unbounded PCollection, must specify number of output shards explicitly
```