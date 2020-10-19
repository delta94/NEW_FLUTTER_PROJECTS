import 'package:seab1ird.disctest/models/Answer.dart';
import 'package:seab1ird.disctest/models/QuestionInfo.dart';
import 'package:seab1ird.disctest/models/Types.dart';

final questions = [
  //0
  new QuestionInfo("In my company, it is", "important to me...", [
    new Answer(
        "To help colleague and to be in a peaceful environment.", Types.S),
    new Answer(
        "To feel that my colleague admire me and to be free from rigid rules.",
        Types.I),
    new Answer(
        "To know exactly what is expected of me and to finish one task before moving to another.",
        Types.C),
    new Answer("To get tasks done and to see results.", Types.D),
  ]),
  //1
  new QuestionInfo(
      "When my colleagues show their opinion or conclusion and I disagree, I am",
      "likely to...", [
    new Answer("Tell them that I disagree.", Types.D),
    new Answer("Say something humorous.", Types.I),
    new Answer("Ask for more information.", Types.S),
    new Answer("Nod and say nothing.", Types.C),
  ]),
  //2
  new QuestionInfo(
      "When I am working on a team and our team encounter a difficulty of some kind, I am",
      "likely to say...", [
    new Answer("Lighten up! Just go with the flow!", Types.I),
    new Answer("Let's make a decision!", Types.D),
    new Answer(
        "How do you feel? I'd like to make sure that everyone is comfortable.",
        Types.S),
    new Answer(
        "Let's consider this more carefully? Do we have all of the data we need?",
        Types.C),
  ]),
  //3
  new QuestionInfo(
      "My attitude towards detail work — like research and data analysis — is",
      "often ...", [
    new Answer("Great. I enjoy research and analysis.", Types.C),
    new Answer(
        "If it will get better and faster results, I'll do it.", Types.D),
    new Answer(
        "If it will make others think more highly of me, I'll do it.", Types.I),
    new Answer(
        "If it will help other people or make things easier, I'll do it.",
        Types.S),
  ]),
  //4
  new QuestionInfo(
      "When I am at an event with many people I have not yet met before, I am",
      "likely to...", [
    new Answer(
        "Find a small group of people with whom I am already comfortable and speak with them in quiet conversation.",
        Types.S),
    new Answer(
        "Seek a good vantage point to observe the event and sit quietly unless someone speaks to me.",
        Types.C),
    new Answer(
        "Meet and talk with as many people as possible before the event is over.",
        Types.I),
    new Answer(
        "Go to the people I need to speak with to fulfill my purpose for attending.",
        Types.D),
  ]),
  //5
  new QuestionInfo("The way I think myself", "is...", [
    new Answer("Doing, driving, and accomplishing.", Types.D),
    new Answer("Patient, kind, and helpful.", Types.S),
    new Answer("Logical, factual, and correct.", Types.C),
    new Answer("Friendly, fun, and persuasive.", Types.I),
  ]),
  //6
  new QuestionInfo(
      "When I suddenly know a coming change, I am", "likely to think...", [
    new Answer("How does it affect me?", Types.I),
    new Answer("Is there a good reason behind it?", Types.C),
    new Answer("What will it do to results and speed?", Types.D),
    new Answer("How does it affect everyone involved?", Types.S),
  ]),
  //7
  new QuestionInfo(
      "The", "accurate way to describe my approach to work is...", [
    new Answer("Plan my work and work my plan.", Types.C),
    new Answer("How would you like for me to do this?", Types.S),
    new Answer(
        "Who will do this with me? Is there anyone to talk with while I work?",
        Types.I),
    new Answer("Get it done. What's next?", Types.D),
  ]),
  //8
  new QuestionInfo(
      "The type of work activities that I enjoy the", "involve...", [
    new Answer(
        "Fast-paced, rapidly changing tasks that create progress.", Types.D),
    new Answer(
        "Working alone and focusing on the task at hand to create excellence.",
        Types.C),
    new Answer(
        "Comfortable and predictable tasks that support the team.", Types.S),
    new Answer("Interacting with many people to create new ideas and energy.",
        Types.I),
  ]),
  //9
  new QuestionInfo("When someone is telephoning me, I am", "interested in…", [
    new Answer("Talking with the person who called.", Types.I),
    new Answer("What they want me to do.", Types.D),
    new Answer("Why they called me.", Types.C),
    new Answer("How I can help.", Types.S),
  ]),
  //10
  new QuestionInfo("The sentence that someone could say that would have the",
      "positive impact on me is…", [
    new Answer("I really appreciate you.", Types.S),
    new Answer("You are fantastic!", Types.I),
    new Answer("You done a lot things.", Types.D),
    new Answer("You do excellent work.", Types.C),
  ]),
  //11
  new QuestionInfo("The projects or tasks that I enjoy the", "allow me to…", [
    new Answer(
        "Collect and evaluate information to build plans or systems.", Types.C),
    new Answer("Achieve big results and overcome a challenge.", Types.D),
    new Answer("Do what I already know how to do at my own pace.", Types.S),
    new Answer(
        "Work with many different people on a wide range of tasks to keep things interesting.",
        Types.I),
  ]),
];
