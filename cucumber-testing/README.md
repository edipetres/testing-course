# Technical proof of concept documentation

Setting up cucumber went surprisingly smooth, it was one of the tools that I did not have problems installing on a Mac. 

The useful thing about using a tool like Cucumber is that you get to plan your work ahead - which can save you lots of headache later. Having to write scenarios will give you a better understanding of the dynamics of your system.

One thing I found is that these tools tend to be language specific and very opinionated. I can see it being useful when we have some syntactic sugar on top of the method names that can give us an a better overview of what is really going on when we return to our code sometime in the future. A human readable language like the Gherkin syntax can significantly improve the time it takes to understand the test cases, no doubt about that.

In reality, when a tool takes me more that 30-60 minutes to install, I usually tend to get frustrated with it, lose my interest and abandon the tool. For example, the TestPairs app only has a windows GUI and the CLI tool that runs in Ruby is outdated and is not supported by the ruby version running on current machines.

I can see the test pair combination being useful in our Gutenberg project when we want to test for a certain combination of books in certain cities, maybe written by specific authors. It covers the code more in depth than running just a single combination of the test case. Ideally, it should also allow us to programmatically generate the test pair combinations and feed them to our data driven test cases.