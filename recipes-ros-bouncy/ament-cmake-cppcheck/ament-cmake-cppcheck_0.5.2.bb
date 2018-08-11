# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The CMake API for ament_cppcheck to perform static code analysis on C/C++     code using Cppcheck."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core ament-cmake-test"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/bouncy/ament_cmake_cppcheck/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ba48f49861a3ad69848ed19920faea6d"
SRC_URI[sha256sum] = "78e6fa542d33b2eec80f5382c51f73f8288b5f72eafc3f3fb76a3d23d8d30aca"
S = "${WORKDIR}/ament_lint-release-release-bouncy-ament_cmake_cppcheck-0.5.2-0"

inherit catkin
