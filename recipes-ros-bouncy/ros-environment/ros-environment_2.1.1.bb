# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The package provides the environment variables `ROS_VERSION` and `ROS_DISTRO`."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ros_environment-release/archive/release/bouncy/ros_environment/2.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5efcbc266af99d6b87476801adfea5e9"
SRC_URI[sha256sum] = "e8c88e2f9929c22893b687112aca58337fda0d056d33c32a3524a79251c9506c"
S = "${WORKDIR}/ros_environment-release-release-bouncy-ros_environment-2.1.1-0"

inherit catkin
