# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to use Python in the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/bouncy/ament_cmake_python/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "057894d5dca217b97ddce364bbc46d85"
SRC_URI[sha256sum] = "99df138eb95d0653501e3663867cbae3b83a816bacd9ecd04d30ed6f6e133433"
S = "${WORKDIR}/ament_cmake-release-release-bouncy-ament_cmake_python-0.5.1-0"

inherit catkin
