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
    'Realistic people prefer to manual labour and enjoy operating devices or vehicles. Many realistic professions involve outdoor work, work with animals and require one to get their hands dirty.',
    'A realistic profession is the opposite of an office job where you sit inside all day.',
    'Common hobbies of realistic people are gardening, having pets, tinkering with cars or other vehicles and outdoor sports such as mountain biking and running.',
    'Sectors that include many realistic professions include agriculture, construction, manufacturing, distribution and transport and shipping and aviation.',
    'Keywords: physical, outdoors, hands, on the road, machines and equipment, animals.'
  ]);

  static TypeInfo resultInfoI = new TypeInfo(
      Types.I, 'Investigative (Thinkers)', Colors.orange, 'images/I.png', [
    'Likes to study and solve math or science problems; generally avoids leading, selling, or persuading people;',
    'Is good at understanding and solving science and math problems;',
    'Values science;',
    'Sees self as precise, scientific, and intellectual.',
    'Investigative people are inquisitive, analytical and like to learn. Investigative professions require one to carefully analyse the tasks at hand.',
    'Many investigative professionals are an expert in their particular field and solve problems through research and analysis.',
    'Typical hobbies of investigative people include intellectual sports such as Sudoku and chess, learning different languages or following additional courses just for the fun of it.',
    'One will encounter many investigative professions in academic education, IT, healthcare and innovative companies.',
    'Keywords: analytical, inquisitive, gaining knowledge, continuous learning, specialist.'
  ]);

  static TypeInfo resultInfoA =
      new TypeInfo(Types.A, 'Artistic (Creators)', Colors.red, 'images/A.png', [
    'Likes to do creative activities like art, drama, crafts, dance, music, or creative writing; generally avoids highly ordered or repetitive activities;',
    'Has good artistic abilities -- in creative writing, drama, crafts, music, or art;',
    'Values the creative arts -- like drama, music, art, or the works of creative writers;',
    'Sees self as expressive, original, and independent.',
    'Artistic people are creative and original by nature. Artistic professions often involve design and expression.',
    'Artistic or creative professions require one to view the world from a new, unique perspective.',
    'This may be by means of images and language, but also ideas themselves.',
    'Typical artistic hobbies include painting, photography, writing, cooking, crafts, design and visiting museums.',
    'One will encounter a relatively large number of artistic professions in advertising, the music industry, theatre, the art sector and at companies in the field of design.',
    'Keywords: artistic, original, creative, design, expression.'
  ]);

  static TypeInfo resultInfoS = new TypeInfo(
      Types.S, 'Social (Helpers)', Colors.purpleAccent, 'images/S.png', [
    'Likes to do things to help people -- like, teaching, nursing, or giving first aid, providing information; generally avoids using machines, tools, or animals to achieve a goal;',
    'Is good at teaching, counseling, nursing, or giving information;',
    'Values helping people and solving social problems;',
    'Sees self as helpful, friendly, and trustworthy.',
    'People who score highly in the social category enjoy assisting others or teaching.',
    'Many social professions require intense collaboration with others or learning new information together.',
    'Social people will generally have a preference for hobbies such as team sports, volunteering and eating out with friends.',
    'Many social professions can be found in the government, education, health care and social services.',
    'Keywords: contact, helpful, service-oriented, social, understanding, empathetic, teaching.'
  ]);

  static TypeInfo resultInfoE = new TypeInfo(
      Types.E, 'Enterprising (Persuaders)', Colors.green, 'images/E.png', [
    'Likes to lead and persuade people, and to sell things and ideas; generally avoids activities that require careful observation and scientific, analytical thinking;',
    'Is good at leading people and selling things or ideas;',
    'Values success in politics, leadership, or business;',
    'Sees self as energetic, ambitious, and sociable.',
    'As the word suggests, enterprising people like to take the initiative, are willing to take risks and are natural leaders.',
    'Enterprising professions often require one to make many (important) decisions, direct and persuade people and take responsibility for the tasks at hand.',
    'Enterprising people will have a preference for hobbies such as investing, training and coaching at a sports club, political side activities and other administrative work.',
    'Enterprising professions can mainly be found in management, marketing, trade, administration and politics.',
    'Keywords: convincing, final responsibility, directing people, taking financial risks.'
  ]);

  static TypeInfo resultInfoC = new TypeInfo(
      Types.C, 'Conventional (Organizers)', Colors.blue, 'images/C.png', [
    'Likes to work with numbers, records, or machines in a set, orderly way; generally avoids ambiguous, unstructured activities',
    'Is good at working with written records and numbers in a systematic, orderly way;',
    'Values success in business;',
    'Sees self as orderly, and good at following a set plan.',
    'Conventional people are often perfectionists who prefer to work in a structured manner and according to set agreements.',
    'Conventional professions often require work to be carried out in accordance with a set pattern or rules.',
    'In addition, the work can be routine or process-based.',
    'Conventional people will have a preference for hobbies that involve collecting things or researching a family tree, for example.',
    'Conventional professions are very common in the banking world, companies that are involved in the management and maintenance of real estate, administrative companies, the financial sector, government and branch organisations.',
    'Keywords: organising, administrative, reliable, accurate, legal, regulating, process-based, procedural.'
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
