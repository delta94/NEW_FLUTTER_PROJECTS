import 'package:flutter/material.dart';
import 'package:seab1ird.disctest/models/TypeInfo.dart';
import 'package:seab1ird.disctest/models/Types.dart';

class Results {
  static TypeInfo resultInfoR = new TypeInfo(
      Types.R, 'Realistic (Doers)', Colors.yellowAccent, 'images/R.png', [
    'People who like to work with “things” and are “assertive and competitive.” They tend to focus on “activities requiring motor coordination, skill and strength” and “prefer to work a problem through by doing something, rather than talking about it, or sitting and thinking about it.” They are also drawn to “concrete approaches to problem solving, rather than abstract theory” and “scientific” and “mechanical” areas, rather than “aesthetic” ones. Sample majors and careers include:',
    'Aerospace/Aeronautical Engineer (with Investigative)',
    'Agriculture',
    'Animals',
    'Anthropology/Paleontology (with Investigative)',
    'Architect (with Artistic and Enterprising)',
    'Astronomy (with Investigative)',
    'Athletics',
    'Carpenter (with Conventional and Investigative)',
    'Culinary arts (with Artistic and Enterprising)',
    'Chemistry/Chemist (with Investigative and Conventional)',
    'Computer engineering/Computer science/Information technology/Computer programmer (with Investigative and Conventional)',
    'Dance (with Artistic)',
    'Dentist (with Investigative and Social)',
    'Engineer (with Investigative and Conventional)',
    'Environmental science',
    'Fashion design (with Artistic and Enterprising)',
    'Fine Artist, Including Painter, Sculptor and Illustrator (with Artistic)',
    'Firefighter (with Social and Enterprising)',
    'Graphic designer (with Artistic and Enterprising)',
    'Interior design (with Artistic)',
    'Model (people) (with Artistic and Enterprising)',
    'Musician (with Artistic and Enterprising)',
    'Nurse (with Social, Conventional, and Investigative)',
    'Outdoor recreation',
    'Park Naturalist (with Social and Artistic)',
    'Personal trainer (with Enterprising and Social)',
    'Photographer (with Artistic and Enterprising)',
    'Physical therapy (with Social and Investigative)',
    'Driver',
    'Surgeon (with Investigative and Social)',
    'Veterinarian (with Investigative and Social)',
    'Web developer (with Conventional, Artistic, and Investigative)',
    'Zoologists and Wildlife Biologists (with Investigative)',
  ]);

  static TypeInfo resultInfoI = new TypeInfo(
      Types.I, 'Investigative (Thinkers)', Colors.orange, 'images/I.png', [
    'People who prefer “to think and observe rather than act,” and “to organize and understand information rather than to persuade.” They are also drawn to working with “data” over working with “people.” Sample majors and careers include:',
    'Actuary(with Conventional and Enterprising)',
    'Archivist/Librarian (with Social and Conventional)',
    'Biostatistics/Masters in Public Health (with Conventional)',
    'Carpenter (with Conventional and Realistic)',
    'Chemistry/Chemist (with Realistic and Conventional)',
    'Community Health Workers/Masters in Public Health (with social and enterprising)',
    'Computer engineering/Computer science/Information technology/Computer programmer (with Realistic and Conventional)',
    'Counselor (with Social and Artistic)',
    'Dentist (with Realistic and Social)',
    'Dietitian/Nutritionist (with Social and Enterprising)',
    'Economics (with Conventional and social)',
    'Engineer (with Realistic and Conventional)',
    'Epidemiology/Masters in Public Health (with Social)',
    'Finance (with Enterprising and Conventional)',
    'Lawyer (with Enterprising and Social)',
    'Mathematician (with Artistic)',
    'Nurse (with Realistic, Conventional, and Social)',
    'Pharmacist (with Social and Conventional),',
    'Physical therapy (with Social and Realistic)',
    'Physician (Medical school/Medical research) (with Social)',
    'Physics',
    'Poets, Lyricists and Creative Writers (with Artistic)',
    'Professor/Research – Ph.D.',
    'Psychology/Psychologist (with Social and Artistic)',
    'Social Work',
    'Surgeon (with Realistic and Social)',
    'Technical writer (with Artistic and Conventional)',
    'Tutor (with Social)',
    'Veterinarian (with Realistic and Social)',
    'Web developer (with Conventional, Realistic, and Artistic)',
    'Zoologists and Wildlife Biologists(with Realistic)',
  ]);

  static TypeInfo resultInfoA =
      new TypeInfo(Types.A, 'Artistic (Creators)', Colors.red, 'images/A.png', [
    'People who like to work with “ideas and things.” They tend to be “creative, open, inventive, original, perceptive, sensitive, independent and emotional.” They rebel against “structure and rules” and dislike “tasks involving people or physical skills.” Sample majors and careers include:',
    'Architect (with Realistic and Enterprising)',
    'Broadcast journalism (with Enterprising)',
    'Clergy (with Social and Enterprising)',
    'Counselor (with Investigative and Social)',
    'Culinary arts (with Realistic and Enterprising)',
    'Dance (with Realistic)',
    'Fashion design (with Realistic and Enterprising)',
    'Fine Artist, Including Painter, Sculptor and Illustrator (with Realistic)',
    'Graphic designer (with Enterprising and Realistic)',
    'Interior design(with Realistic)',
    'Model (people) (with Realistic and Enterprising)',
    'Musician (with Enterprising and Realistic)',
    'Park Naturalist (with Social and Realistic)',
    'Poets, Lyricists and Creative Writers (with Investigative)',
    'Psychology/Psychologist (with Social and Investigative); Art therapist/Dance therapy/Drama therapy/Music therapy (with social)',
    'Public relations (with Enterprising)',
    'Photographer (with Realistic and Enterprising)',
    'Teacher (with Social)',
    'Technical writer (with Investigative and Conventional)',
    'Trainer (business) (with Social and Conventional)',
    'Web developer (with Conventional, Realistic, and Investigative)',
  ]);

  static TypeInfo resultInfoS = new TypeInfo(
      Types.S, 'Social (Helpers)', Colors.purpleAccent, 'images/S.png', [
    'People who like to work with “people” and who “seem to satisfy their needs in teaching or helping situations.” They tend to be “drawn more to seek close relationships with other people and are less apt to want to be really intellectual or physical.” Sample majors and careers include:',
    'Archivist/Librarian (with Conventional and Investigative)',
    'Clergy (with Artistic and Enterprising)',
    'Community Organizer',
    'Community Health Workers/Masters in Public Health (with Investigative and Enterprising)',
    'Counselor (with Investigative and Artistic)',
    'Customer service (with Conventional and Enterprising)',
    'Dentist (with Investigative and Realistic)',
    'Dietitian/Nutritionist (with Investigative and Enterprising)',
    'Economics (with Investigative and Conventional)',
    'Education (Teacher/Counselor/Administration)',
    'Educational administration (with Enterprising and Conventional)',
    'Epidemiology/Masters in Public Health (with Investigative)',
    'Firefighter (with Realistic and Enterprising)',
    'Fitness Trainer and Aerobics Teacher (with Enterprising and Realistic)',
    'Foreign Service/Diplomacy (with Enterprising and Artistic)',
    'Human Resources (with Conventional and Enterprising)',
    'Lawyer (with Investigative and Enterprising)',
    'Nurse (with Realistic, Conventional, and Investigative)',
    'Park Naturalist (with Realistic and Artistic)',
    'Pharmacist (with Investigative and Conventional)',
    'Physical therapy (with Realistic and Investigative)',
    'Physician (Medical school/Medical research) (with Investigative)',
    'Psychology/Psychologist (with Investigative and Artistic)',
    'Public Health Educator/Masters in Public Health (with Enterprising)',
    'Religion',
    'Social Advocate',
    'Sociology',
    'Social Work',
    'Surgeon (with Realistic and Investigative)',
    'Teacher (Early childhood education, Primary school, Secondary school, Teaching English as a second language, Special Ed, and Substitute teaching) (with Artistic)',
    'Trainer (business) (with Artistic and Conventional)',
    'Tutor (with Investigative)',
    'Veterinarian (with Investigative and Realistic)',
  ]);

  static TypeInfo resultInfoE = new TypeInfo(
      Types.E, 'Enterprising (Persuaders)', Colors.green, 'images/E.png', [
    'People who like to work with “people and data.” They tend to be “good talkers, and use this skill to lead or persuade others.” They are also drawn to high power situations, valuing “power, money and status.” Sample majors and careers include:',
    'Actuary (with Investigative and Conventional)',
    'Architect (with Artistic and Realistic)',
    'Buyer',
    'Community Health Workers/Masters in Public Health (with Investigative and Social)',
    'Culinary arts (with Artistic and Realistic)',
    'Clergy (with Artistic and Social)',
    'Customer service (with Conventional and Social)',
    'Dietitian/Nutritionist (with Social and Investigative)',
    'Educational administration (with Social and Conventional)',
    'Entrepreneur and Business',
    'Fashion design (with Artistic and Realistic)',
    'Finance (with Conventional and Investigative)',
    'Foreign Service/Diplomacy (with Social and Artistic)',
    'Firefighter (with Social and Realistic)',
    'Fitness Trainer and Aerobics Teacher (with Realistic and Social)',
    'Fundraising',
    'Graphic designer (with Artistic and Realistic)',
    'Human Resources (with Conventional and Social)',
    'Broadcast journalism (with Artistic)',
    'Lawyer (with Investigative and Social)',
    'Management/Management Consultant',
    'Market Research Analyst (with Investigative)',
    'Model (people) (with Artistic and Realistic)',
    'Musician (with Artistic and Realistic)',
    'Photographer (with Artistic and Realistic)',
    'Politics',
    'Public Health Educator/Masters in Public Health (with Social)',
    'Public relations/Publicity/Advertising/Marketing (with Artistic)',
    'Public speaking',
    'Real Estate Agent (with Conventional)',
    'Sales (with Conventional and Social)',
  ]);

  static TypeInfo resultInfoC = new TypeInfo(Types.C,
      'Conventional (Organizers)', Colors.lightBlueAccent, 'images/C.png', [
    'People who prefer to work with “data” and who “like rules and regulations and emphasize self-control…they like structure and order, and dislike unstructured or unclear work and interpersonal situations.” They also value “power” and “status.” Sample majors and careers include:',
    'Accounting/Tax advisor (with Enterprising)',
    'Actuary (with Investigative and Enterprising)',
    'Archivist/Librarian (with Social and Investigative)',
    'Biostatistics/Masters in Public Health (with Investigative)',
    'Carpenter (with Realistic and Investigative)',
    'Chemistry/Chemist (with Investigative and Realistic)',
    'Computer engineering/Computer science/Information technology/Computer programmer (with Investigative and Realistic)',
    'Customer service (with Enterprising and Social)',
    'Economics (with Investigative and Social)',
    'Educational administration (with Social and Enterprising)',
    'Engineer (with Investigative and Realistic)',
    'Finance (with Enterprising and Investigative)',
    'Human Resources (with Enterprising and Social)',
    'Math teacher (with Social)',
    'Nurse (with Realistic, Social, and Investigative)',
    'Office administration (with Enterprising)',
    'Pharmacist (with Social and Investigative),',
    'Real Estate Agent (with Enterprising)',
    'Statistician(with Realistic and Investigative)',
    'Technical writer (with Artistic and Investigative)',
    'Trainer (business) (with Social and Artistic)',
    'Web developer (with Artistic, Realistic, and Investigative)',
  ]);

  static TypeInfo getResultInfoByType(Types type) {
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

  static List<TypeInfo> getResultInfos() {
    List<TypeInfo> resultInfos = [
      Results.resultInfoR,
      Results.resultInfoI,
      Results.resultInfoA,
      Results.resultInfoS,
      Results.resultInfoE,
      Results.resultInfoC
    ];

    return resultInfos;
  }
}
