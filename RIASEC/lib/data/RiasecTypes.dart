import 'package:flutter/material.dart';
import 'package:seab1ird.disctest/models/TypeInfo.dart';
import 'package:seab1ird.disctest/models/Types.dart';

class RiasecTypes {
  static TypeInfo resultInfoR = new TypeInfo(
      Types.R, 'Realistic (Doers)', Colors.yellowAccent, 'images/R.png', [
    'Likes to work with animals, tools, or machines; generally avoids social activities like teaching, healing, and informing others;',
    'Has good skills in working with tools, mechanical or electrical drawings, machines, or plants and animals;',
    'Values practical things you can see, touch, and use like plants and animals, tools, equipment, or machines;',
    'Sees self as practical, mechanical, and realistic.',
  ]);

  static TypeInfo resultInfoI = new TypeInfo(
      Types.I, 'Investigative (Thinkers)', Colors.orange, 'images/I.png', [
    'Likes to study and solve math or science problems; generally avoids leading, selling, or persuading people;',
    'Is good at understanding and solving science and math problems;',
    'Values science;',
    'Sees self as precise, scientific, and intellectual.',
  ]);

  static TypeInfo resultInfoA =
      new TypeInfo(Types.A, 'Artistic (Creators)', Colors.red, 'images/A.png', [
    'Likes to do creative activities like art, drama, crafts, dance, music, or creative writing; generally avoids highly ordered or repetitive activities;',
    'Has good artistic abilities -- in creative writing, drama, crafts, music, or art;',
    'Values the creative arts -- like drama, music, art, or the works of creative writers;',
    'Sees self as expressive, original, and independent.',
  ]);

  static TypeInfo resultInfoS = new TypeInfo(
      Types.S, 'Social (Helpers)', Colors.purpleAccent, 'images/S.png', [
    'Likes to do things to help people -- like, teaching, nursing, or giving first aid, providing information; generally avoids using machines, tools, or animals to achieve a goal;',
    'Is good at teaching, counseling, nursing, or giving information;',
    'Values helping people and solving social problems;',
    'Sees self as helpful, friendly, and trustworthy.',
  ]);

  static TypeInfo resultInfoE = new TypeInfo(
      Types.E, 'Enterprising (Persuaders)', Colors.green, 'images/E.png', [
    'Likes to lead and persuade people, and to sell things and ideas; generally avoids activities that require careful observation and scientific, analytical thinking;',
    'Is good at leading people and selling things or ideas;',
    'Values success in politics, leadership, or business;',
    'Sees self as energetic, ambitious, and sociable.',
  ]);

  static TypeInfo resultInfoC = new TypeInfo(
      Types.C, 'Conventional (Organizers)', Colors.blue, 'images/C.png', [
    'Likes to work with numbers, records, or machines in a set, orderly way; generally avoids ambiguous, unstructured activities',
    'Is good at working with written records and numbers in a systematic, orderly way;',
    'Values success in business;',
    'Sees self as orderly, and good at following a set plan.',
  ]);

  static TypeInfo getInfoByType(Types type) {
    switch (type) {
      case Types.R:
        return resultInfoR;
        break;
      case Types.I:
        return resultInfoI;
        break;
      case Types.A:
        return resultInfoA;
        break;
      case Types.S:
        return resultInfoS;
        break;
      case Types.E:
        return resultInfoE;
        break;
      case Types.C:
        return resultInfoC;
        break;
      default:
        return resultInfoR;
        break;
    }
  }

  static List<TypeInfo> getInfos() {
    List<TypeInfo> resultInfos = [
      resultInfoR,
      resultInfoI,
      resultInfoA,
      resultInfoS,
      resultInfoE,
      resultInfoC,
    ];

    return resultInfos;
  }
}
