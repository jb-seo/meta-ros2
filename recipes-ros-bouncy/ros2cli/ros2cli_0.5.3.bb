# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Framework for ROS 2 command line tools."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "python3-pkg-resources rclpy"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/bouncy/${PN}/0.5.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c07c52ce16f15f8670cab9f312d13504"
SRC_URI[sha256sum] = "81ac66d3d48b781f51d9608aabd3f6487b303f58e0f88bfa0a5a4216c0e921af"
S = "${WORKDIR}/${PN}-release-release-bouncy-${PN}-0.5.3-0"

inherit catkin
