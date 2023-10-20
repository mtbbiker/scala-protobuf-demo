## Demo that shows how to convert scala case classes to a `*.proto` file

### Precondition

Clone and deploy the following `sbt-plugin` => `https://github.com/bakenezumi/scala2protobuf`


Objective: Generate a `.proto` file and then use that file in other Projects to serialize/deserialize protobuf messages

1. Run `sbt scala2protobuf` to convert the case classes to a `.proto` file (See target/scala-2.13/resourced_managed directory)
2. Copy the `.proto` file to the `src/main/protobuf` directory. 
3. Edit the file (to change/effect the namespaces in the Classes generated)
4. Run `sbt protocGenerate` to Create the Protobuf required classes to use the protobuf in your project