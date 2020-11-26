import 'package:ml_algo/ml_algo.dart';
import 'package:ml_dataframe/ml_dataframe.dart';

/// A simple usage example using synthetic data. To see more complex examples,
/// please, visit other directories in this folder
Future main() async {
  final data = <Iterable>[
    ['my blood', 'my terrain', 'enemy flood', 'enemy terrain', 'decision'],
    [100, 1, 50, 1, 1],
    [50, 1, 50, 1, 1],
    [40, 1, 50, 1, 0],
    [10, 1, 90, 1, 0],
    [50, 1, 80, 1, 0],
    [10, 1, 9, 1, 1],
    [10, 1, 10, 1, 1],
    [9, 1, 9, 1, 1],
    [3, 1, 10, 1, 0],
    [3, 1, 1, 1, 1],
    //
    [100, 1, 50, 0, 1],
    [50, 1, 50, 0, 1],
    [10, 1, 10, 0, 1],
    [40, 1, 50, 0, 0],
    [10, 1, 90, 0, 0],
    [10, 1, 20, 0, 0],
    [50, 1, 80, 0, 0],
    [10, 1, 9, 0, 1],
    [10, 1, 8, 0, 1],
    [50, 1, 10, 0, 1],
    [9, 1, 9, 0, 1],
    [3, 1, 10, 0, 0],
    [3, 1, 1, 0, 1],
    //
    [100, 0, 50, 1, 1],
    [50, 0, 50, 1, 1],
    [40, 0, 50, 1, 0],
    [10, 0, 90, 1, 0],
    [50, 0, 80, 1, 0],
    [10, 0, 10, 1, 1],
    [10, 0, 9, 1, 1],
    [9, 0, 9, 1, 1],
    [3, 0, 10, 1, 0],
    [3, 0, 1, 1, 1],
    [9, 0, 1, 1, 1],
  ];
  final targetName = 'decision';
  final samples = DataFrame(data, headerExists: true);
  final classifier = LogisticRegressor(
    samples,
    targetName,
  );

  final data1 = <Iterable>[
    ['my blood', 'my terrain', 'enemy flood', 'enemy terrain'],
    [10, 1, 7, 0]
  ];

  print(classifier.predict(DataFrame(data1)).rows);
}
