# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The CMake API for ament_clang_format to lint C / C++ code using clang format."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core ament-cmake-test"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/bouncy/ament_cmake_clang_format/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f9f522be9a15432b1311d13933e6d50b"
SRC_URI[sha256sum] = "36fd43f9e32637dc4688887228948337a60e65608bcb775bc5922d3db7558149"
S = "${WORKDIR}/ament_lint-release-release-bouncy-ament_cmake_clang_format-0.5.2-0"

inherit ros
inherit cmake python3native


BBCLASSEXTEND += "native"