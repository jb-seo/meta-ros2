# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Test package, which uses things exported by osrf_testing_tools_cpp."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "cmake"
SRC_URI = "https://github.com/ros2-gbp/osrf_testings_tools_cpp-release/archive/release/bouncy/test_osrf_testing_tools_cpp/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "603e65bc5966af754275a4617cb2d69d"
SRC_URI[sha256sum] = "d3768f86ab601e98d4afd1e184c741ddd65a82947286caa3a36ee8bdd4c3e699"
S = "${WORKDIR}/osrf_testings_tools_cpp-release-release-bouncy-test_osrf_testing_tools_cpp-1.0.0-0"

inherit catkin
