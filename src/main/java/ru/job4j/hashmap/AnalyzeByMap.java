package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {

        int totalScore = 0;
        int totalSubjects = 0;

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
                totalSubjects++;
            }
        }
        return (double) totalScore / totalSubjects;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {

        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int pupilScore = 0;
            double averageValue = 0;
            List<Subject> subjects = pupil.subjects();
            for (Subject subject : subjects) {
                pupilScore += subject.score();
            }
            averageValue = (double) pupilScore / subjects.size();
            labels.add(new Label(pupil.name(), averageValue));
        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> subjectsScores = new LinkedHashMap<>();
        Map<String, Integer> subjectsCounter = new LinkedHashMap<>();

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                String name = subject.name();
                int score = subject.score();

                if (subjectsScores.containsKey(name)) {
                    subjectsScores.put(name, subjectsScores.get(name) + score);
                } else {
                    subjectsScores.put(name, score);
                }

                if (subjectsCounter.containsKey(name)) {
                    subjectsCounter.put(name, subjectsCounter.get(name) + 1);
                } else {
                    subjectsCounter.put(name, 1);
                }
            }
        }

        List<Label> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : subjectsScores.entrySet()) {
            result.add(new Label(entry.getKey(), (double) entry.getValue() / subjectsCounter.get(entry.getKey())));
        }
        return result;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int pupilScore = 0;
            List<Subject> subjects = pupil.subjects();
            for (Subject subject : subjects) {
                pupilScore += subject.score();
            }
            labels.add(new Label(pupil.name(), pupilScore));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> subjectsScores = new LinkedHashMap<>();

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                String name = subject.name();
                int score = subject.score();

                subjectsScores.put(name, subjectsScores.getOrDefault(name, 0) + score);
            }
        }

        List<Label> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : subjectsScores.entrySet()) {
            result.add(new Label(entry.getKey(), (double) entry.getValue()));
        }

        result.sort(Comparator.naturalOrder());
        return result.get(result.size() - 1);
    }
}