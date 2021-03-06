//
// Dog.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public struct Dog: Codable { 


    public private(set) var className: String
    public private(set) var color: String? = "red"
    public private(set) var breed: String?

    public init(className: String, color: String?, breed: String?) {
        self.className = className
        self.color = color
        self.breed = breed
    }

}
