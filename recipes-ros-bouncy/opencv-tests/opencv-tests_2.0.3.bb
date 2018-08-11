# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "OpenCV tests for the Python and C++ implementations of CvBridge with Image message in ROS2."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge launch rclpy sensor-msgs"
SRC_URI = "https://github.com/ros2-gbp/vision_opencv-release/archive/release/bouncy/opencv_tests/2.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8dc1cd121c47c5d7d750615ca21afb72"
SRC_URI[sha256sum] = "94baff7ad64ee595d2f2851e72926e19cf55bce0a063d4c7a075b22c62559a0b"
S = "${WORKDIR}/vision_opencv-release-release-bouncy-opencv_tests-2.0.3-0"

inherit catkin
