# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS specific extensions to the launch tool."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-index-python launch lifecycle-msgs osrf-pycommon rclpy"
SRC_URI = "https://github.com/ros2-gbp/launch-release/archive/release/bouncy/launch_ros/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9bd991cab8e3d214c6ecda8d02242106"
SRC_URI[sha256sum] = "128d95891474889df7cb24d9f046f2949676e5badc91459ee0c8a076db54bae2"
S = "${WORKDIR}/launch-release-release-bouncy-launch_ros-0.5.2-0"

inherit catkin
