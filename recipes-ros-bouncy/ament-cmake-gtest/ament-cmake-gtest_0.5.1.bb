# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to add gtest-based tests in the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/bouncy/ament_cmake_gtest/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e77bdcd6f3106ffae2f2efdc245964f7"
SRC_URI[sha256sum] = "a002784496de9d470b74895b7f048115e4a109f5c5e7d99ddcc3145435d4e4a7"
S = "${WORKDIR}/ament_cmake-release-release-bouncy-ament_cmake_gtest-0.5.1-0"

inherit catkin
