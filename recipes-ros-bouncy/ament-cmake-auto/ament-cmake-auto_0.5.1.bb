# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The auto-magic functions for ease to use of the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/bouncy/ament_cmake_auto/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2511a1c87f3134945f1c224c71095080"
SRC_URI[sha256sum] = "a7eff07476e613c59ec338f6ead06db7c4bbf8b01524fbc7f987394d322c11b6"
S = "${WORKDIR}/ament_cmake-release-release-bouncy-ament_cmake_auto-0.5.1-0"

inherit catkin
