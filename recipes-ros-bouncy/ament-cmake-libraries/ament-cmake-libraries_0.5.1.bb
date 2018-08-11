# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The functionality to deduplicate libraries in the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/bouncy/ament_cmake_libraries/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4833f648968daae438c0db3ed3a86af4"
SRC_URI[sha256sum] = "c2b46f5954b70525580a2c7fc37136df3f2c79ef0a416cbbe7d46117577e6de0"
S = "${WORKDIR}/ament_cmake-release-release-bouncy-ament_cmake_libraries-0.5.1-0"

inherit catkin
