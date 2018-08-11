# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Examples for composing multiple nodes in a single process."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake ament-index-cpp class-loader example-interfaces rclcpp rcutils rosidl-cmake rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/bouncy/${PN}/0.5.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a13bd4b0d2b27f8c7b04ef6dfe6c0a47"
SRC_URI[sha256sum] = "b5f5af7a8107b1f7d3c133bbf6bc2423714c04fb7e0dc5791c0bbc2335deffb0"
S = "${WORKDIR}/demos-release-release-bouncy-${PN}-0.5.1-1"

inherit catkin
