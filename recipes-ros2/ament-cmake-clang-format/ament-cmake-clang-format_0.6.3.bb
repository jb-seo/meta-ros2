# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The CMake API for ament_clang_format to lint C / C++ code using clang format."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core ament-cmake-test"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_cmake_clang_format/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8cb5ed3142dce2b6b7168d8409c36374"
SRC_URI[sha256sum] = "417ce7c404aef2abaf9853733bde0c2430ce16416e6cff689f3af59f1e5c6bff"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_cmake_clang_format-0.6.3-0"

inherit catkin
