# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The package provides GoogleTest."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake"
SRC_URI = "https://github.com/ros2-gbp/googletest-release/archive/release/bouncy/gtest_vendor/1.8.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f1610ef098b10b8dadea105373d89949"
SRC_URI[sha256sum] = "1bb5f6d995f05289126d0cbe7b6e4534d8ac6754d0836c8cadf0d1aee2879db0"
S = "${WORKDIR}/googletest-release-release-bouncy-gtest_vendor-1.8.0-0"

inherit catkin
