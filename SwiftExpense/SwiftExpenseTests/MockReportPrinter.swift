//
//  MockReportPrinter.swift
//  SwiftExpenseTests
//
//  Created by tskim on 2019/11/06.
//  Copyright © 2019 assin. All rights reserved.
//

@testable import SwiftExpense

class MockReportPrinter: ReportPrinter {
    
    private var printedText: String = ""

    func reportPrint(text: String) {
        printedText += text
    }
    
    func getText() -> String {
        return printedText
    }
}
