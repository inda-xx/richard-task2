# 🚀 Galactic Astrology: Constructing Constellation Classes! 🌌 

For the second part of INDA, you'll be sharpening your skills in object modeling using Java. The focus here is to understand the constituents of a Java class.

### ☠️ Deadline

This assignment should be completed before **Tuesday, September 20th**.

### 👩‍🏫 Instructions

For step-by-step instructions and assignment submission, please visit the [course's assignment section](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📖 Preparation

Kindly go through and respond to the questions in Module 2's OLI material.

- Go through [Looking Inside Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- Go to https://kth.oli.cmu.edu/, sign up and register with the 'dd1337-ht22' course key, if you haven't done so already.

> **Assistant's Note:** The OLI material may not always align with our tasks. If you cannot find all the needed material, do not hesitate to proceed further.

### ✅ Learning Goals

After this week, you'll understand:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating getters and setters
* Printing to the terminal
* Using the `main` method
* Scope (or *variable shadowing*)

### 🚨 Troubleshooting

If you have issues or questions, you should:

1. Look at this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). Are others facing the same problem?
2. If not, ask your question by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Add a descriptive title, beginning with "Task *x*: *summary of problem here*".
3. Consult with a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule for the next lab session.

You're encouraged to discuss with your coursemates, but remember, **do not share answers**!

### 📚 Assignment

Several renowned astrologers are visiting the Royal Institute of Technology. Your task is to aid them by modeling *constellations* in Java! These constellations have unique attributes:

- `String` name
- `int` stars (**count of stars**)
- `boolean` visible
- `String` seasonalViewing

The steps to complete your task are as follows:

#### Step 2.0 -- Fields
In the [`src`](src) folder, create a new class called `Constellation.java`. You're to use [fields](https://docs.oracle.com/javase/tutorial/java/javaOO/variables.html) to represent the attributes of these constellations.

#### Step 2.1 -- Getters and Setters
You'll need to restrict direct access to the Constellation class's state. This can be done by setting the fields' [access modifiers](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html) to `private`. However, you still want to manipulate these fields. This can be done by adding **accessors** and **mutators** (or *getters* and *setters*). Include these for all fields—a total of eight methods. 

#### Step 2.2 -- Constructor
Constructing objects as in Step 2.1 can be tedious. Instead, you should leverage a *constructor*. Implement a constructor as shown in the OLI material and repeat Step 2.1 with this implementation.

#### Step 2.3 -- `printDetails()`
To print every detail about the constellation to the terminal, you'll need to create a `printDetails()` method. The return type should be `void`.

#### Step 2.4 -- `isVisible()`
Astrologers are all about predictability. Add a method named `isVisible()` that leverages the `seasonalViewing` attribute to determine if a constellation can be viewed in the current season.

#### Step 2.5 -- Variable Shadowing
Finally, investigate a miscellaneous concept—*variable shadowing*. You might need to fix relevant examples in class.

> **Assistant's Note:** Factor in *local scope*, *global variables*, and *instance fields* for your examples.

### 🐞 Bugs or errors?
If you spot any inaccuracies or issues with this exercise, kindly raise a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the title "Task *x* Error: *summary of error*". Your vigilance will be rewarded with mentions in the acknowledgment section.