# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Custom messages for real-time pendulum control."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake builtin-interfaces rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/bouncy/pendulum_msgs/0.5.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a825265076be1d87494319f4653df8d6"
SRC_URI[sha256sum] = "f960fe64a941379222eff4d5dcd6a45f640940653938af8395d6873219bf16f0"
S = "${WORKDIR}/demos-release-release-bouncy-pendulum_msgs-0.5.1-1"

inherit catkin
