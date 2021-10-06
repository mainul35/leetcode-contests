# Introduction
In most of the technology based organizations, the first defence of a recruitment process is the coding challange.
I have been currently working as a Senior Software Engineer at BRED IT, Thailand, and I am planning to chase the big
giants in technology. Therefore I will try to note down all the things I do to prepare myself for cracking the coding 
interviews.

My preferred language is Java, so whatever I will note here will either be in pseudo code or in Java.

## Basics of Programming
I will start with the very basic data structure - Array

**Array**

Array acquires the given amount of memory address from RAM and contains 
more than one value of the given type.

Let's say, we have an array `a` of 10 `integer` values. So we will define it as follows.

```
    int[] a = new int[]{1, 2, 4, 6 5, 3, 7, 10, 8, 9};
```

If we want to access a value from this array and print it, let's say - 5th value with 0 based indexing:

```
    System.out.println(a[4]);
```

If we want to replace a value of an index, let's say - 7th index:

```
    a[6] = 33;
```

### Understanding time complexity:

Let's say, a statement takes only 1 second to execute. So, if it is run inside a loop for n times,
then the complexity will be n for the whole loop to finish.

Considering this, if we want to iterate over this array `a`, we will have to pass it 
through a loop. Let's look at the following example:

```
    for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
    }
```

The complexity of above operation will be `n`. But when we are trying to access
specifically one item from this array, for example, `a[4]`, it will be only one execution,
hence the complexity will be 1.

Complexities can be - **Time Complexity** and **Memory Complexity**
