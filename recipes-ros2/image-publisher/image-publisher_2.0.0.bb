# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "<p>       Contains a node publish an image stream from single image file       or avi motion file.     </p>"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " camera-info-manager class-loader cv-bridge image-transport rclcpp"
SRC_URI = "https://github.com/ros2-gbp/image_pipeline-release/archive/release/crystal/image_publisher/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4034b7cd3946c7000eb94dfbe50c2d9b"
SRC_URI[sha256sum] = "399a70053d065f616ea3b8a4dcc0b8aa5aba278c3e12d60be4dadfffe39dc7eb"
S = "${WORKDIR}/image_pipeline-release-release-crystal-image_publisher-2.0.0-0"

inherit ament
