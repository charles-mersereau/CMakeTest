﻿# CMakeList.txt : Top-level CMake project file, do global configuration
# and include sub-projects here.
#
cmake_minimum_required (VERSION 3.8)

project ("CMakeTest")

# Include sub-projects.
add_library (
        chewy-lib
        SHARED
        CMakeTest/Chewy.cpp
)

include_directories(
        CMakeTest
)
