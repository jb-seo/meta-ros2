# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The service command for ROS 2 command line tools."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "python3-yaml rclpy ros2cli ros2srv ros2topic"
SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/crystal/${PN}/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7baea6f3059dcf0a769254b71ead1178"
SRC_URI[sha256sum] = "4034b2face753bc2960ae7ad0d7b0c009e7f51f14639fafd7f6386397c2340c8"
S = "${WORKDIR}/ros2cli-release-release-crystal-${PN}-0.6.3-0"

inherit catkin
