using System;
using System.IO;
using System.Windows;

namespace DirectoryDemo
{
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void showButton_Click(object sender, RoutedEventArgs e)
        {
            filesTextBox.Clear();
            foldersTextBox.Clear();

            // Display all file names
            string[] files = Directory.GetFiles(folderTextBox.Text);
            foreach (string file in files)
            {// alleen bestandsnaam en niet het pad van het bestand 
                filesTextBox.AppendText(System.IO.Path.GetFileName(file));
                // van pad van bestand directory opvragen => System.IO.Path.GetDirectoryName
                filesTextBox.AppendText(Environment.NewLine);
            }

            // Display all folder names
            string[] directories = Directory.GetDirectories(folderTextBox.Text);
            foreach (string directory in directories)
            {
                foldersTextBox.AppendText(directory);
                foldersTextBox.AppendText(Environment.NewLine);
            }
        }
    }
}
