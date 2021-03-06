﻿using System.Windows;
using System.Windows.Controls;
using System.Windows.Media;
using System.Windows.Shapes;

namespace Triangle_Method
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void drawButton_Click(object sender, RoutedEventArgs e)
        {
            SolidColorBrush blackBrush = new SolidColorBrush(Colors.Black);

            DrawLogo(paperCanvas, blackBrush, 10, 20);
            DrawLogo(paperCanvas, blackBrush, 100, 100);
            //DrawTriangle(paperCanvas, blackBrush, 100, 10, 40, 40);
            //DrawTriangle(paperCanvas, blackBrush, 10, 100, 20, 60);
            DrawTriangle(paperCanvas, blackBrush, 100, 10, 100, 50, 140, 50);
            DrawTriangle(paperCanvas, blackBrush, 10,100,10,160,30,160);
        }

        private void DrawTriangle(Canvas drawingArea,
                                  SolidColorBrush brushToUse,
                                  double topX,
                                  double topY,
                                  double width,
                                  double height)
        {
            DrawLine(drawingArea, brushToUse, topX, topY,
                     topX, topY + height);
            DrawLine(drawingArea, brushToUse, topX,
                     topY + height,
                     topX + width, topY + height);
            DrawLine(drawingArea, brushToUse, topX, topY,
                     topX + width, topY + height);
        }
        // alternatieve methode om de driehoek te tekenen
        // method overloading
        private void DrawTriangle(Canvas drawingArea,
                                SolidColorBrush brushToUse,
                                double topX,
                                double topY,
                                double leftX, double leftY,
                                double rightX, double rightY)
        {
            DrawLine(drawingArea, brushToUse, topX, topY,
                     leftX, leftY);
            DrawLine(drawingArea, brushToUse, leftX, leftY, rightX, rightY);
            DrawLine(drawingArea, brushToUse,topX  , topY, rightX, rightY);
        }

        private void DrawLine(Canvas drawingArea,
                              SolidColorBrush brushToUse,
                              double startX, double startY,
                              double endX, double endY)
        {
            Line theLine = new Line
            {
                X1 = startX,
                X2 = endX,
                Y1 = startY,
                Y2 = endY,
                Stroke = brushToUse,
                StrokeThickness = 1
            };
            drawingArea.Children.Add(theLine);
        }

        private void DrawLogo(Canvas drawingArea,
                              SolidColorBrush brushToUse,
                              double xPosition,
                              double yPosition)
        {
            DrawRectangle(drawingArea, brushToUse, xPosition, yPosition, 20);
            DrawRectangle(drawingArea, brushToUse, xPosition, yPosition, 40);
            DrawRectangle(drawingArea, brushToUse, xPosition, yPosition, 60);
        }

        private void DrawRectangle(Canvas drawingArea,
                                   SolidColorBrush brushToUse,
                                   double xPosition,
                                   double yPosition,
                                   double size)
        {
            Rectangle theRectangle = new Rectangle
            {
                Width = size,
                Height = size,
                Margin = new Thickness(xPosition, yPosition, 0, 0),
                Stroke = brushToUse
            };
            drawingArea.Children.Add(theRectangle);
        }
    }
}
