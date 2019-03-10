# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The CMake API for ament_cppcheck to perform static code analysis on C/C++     code using Cppcheck."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core ament-cmake-test"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_cmake_cppcheck/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1b351f295591c7e38d62d9c30edf0bab"
SRC_URI[sha256sum] = "667353ee81abbc3801528c2ad4b296b4b3531aceff523045b06cade8a1e6790e"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_cmake_cppcheck-0.6.3-0"

inherit catkin
