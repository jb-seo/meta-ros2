# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The lifecycle command for ROS 2 command line tools."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "lifecycle-msgs python3-yaml rclpy ros2cli ros2node ros2service"
SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/bouncy/${PN}/0.5.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3e9442fcba08238c511096125c139087"
SRC_URI[sha256sum] = "9e7807ded0c94770adb79a4ead978aadacca9b21e4cb7800b82530ad8304195d"
S = "${WORKDIR}/ros2cli-release-release-bouncy-${PN}-0.5.3-0"

inherit catkin
