# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS specific extensions to the launch tool."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-index-python launch lifecycle-msgs osrf-pycommon python3-yaml rclpy"
SRC_URI = "https://github.com/ros2-gbp/launch-release/archive/release/crystal/launch_ros/0.7.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ed821132ba30db6fe744f1f3eb9aaf9d"
SRC_URI[sha256sum] = "7f3fb2d2c2b58152eab48a43cf56ce5767a4669733ae3576771f6d4123c8f31f"
S = "${WORKDIR}/launch-release-release-crystal-launch_ros-0.7.3-0"

inherit catkin
