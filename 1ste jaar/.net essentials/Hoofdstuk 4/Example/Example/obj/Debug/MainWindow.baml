   M S B A M L   `   `   `  ����B  >Example, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null!clr-namespace:ExampleExample  5   	       Example.MainWindow   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   'localclr-namespace:Example     5   	     � Title$  Euros and cents��5   	   $	��450��6!   $	��800��6.   .��5	      � .+�5   
   �� -   5        $��	Calculate��5      $
��Left=�6%   $��36��6@   $��130,186,0,0q�6L   $	��Top=�6a   $	��132��6y   6�   �� 5   
   -   5        $��inputTextBox��5      $
��Left=�6&   $��21��6A   $��130,102,0,0q�6M    �� TextWrapping$
 Wrap=�6b   $	��Top=�6v   $	��132��6�   �� 5   
   $��Input cents��6   $
��Left=�6R   $��31��6m   $��130,139,0,0q�6y   $	��Top=�6�   $	��132��6�    �� Target 6&   ��  �� ElementName$ inputTextBox��6�   �� 5   
   -   5        $��outputTextBlockEuro��5      
����ح�$
��Left=�6F   $��21��6a   $��334,102,0,0q�6m   $
��Wrap=�6�   $	��Top=�6�   $	��159��6�   �� 5   
   -   5        $��outputTextBlockWritten��5      
����ح�$
��Left=�6I   $��21��6d   $��334,144,0,0q�6p   $
��Wrap=�6�   $	��Top=�6�   $	��159��6�   5      5      