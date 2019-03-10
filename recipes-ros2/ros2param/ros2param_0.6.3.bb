# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The param command for ROS 2 command line tools."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "rcl-interfaces rclpy ros2cli ros2node"
SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/crystal/${PN}/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4c75d36eab16b0c0393e2aefc6774e9d"
SRC_URI[sha256sum] = "4e9e9bf121ab885ecbc1994379ec6722c85a41abca9e6d4bf5454fcce40cd171"
S = "${WORKDIR}/ros2cli-release-release-crystal-${PN}-0.6.3-0"

inherit catkin
